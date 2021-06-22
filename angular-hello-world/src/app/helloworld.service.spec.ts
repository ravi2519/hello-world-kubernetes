import { TestBed } from '@angular/core/testing';

import { HelloworldService } from './helloworld.service';

describe('HelloworldService', () => {
  let service: HelloworldService;

  beforeEach(() => {
    TestBed.configureTestingModule({});
    service = TestBed.inject(HelloworldService);
  });

  it('should be created', () => {
    expect(service).toBeTruthy();
  });
});
